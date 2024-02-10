import java.sql.*;
import java.util.Scanner;

public class Main {

    //defined variables
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="Shashi123";
    public static void main(String[] args) {

        //load drivers
        try{
            Class.forName("com.sql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //connection establish
        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //retrieving data from sql table
//            String query="select * from students";//query help to retrieve data
//            ResultSet resultSet=statement.executeQuery(query); //pass query here and to hold data
//
//            while(resultSet.next()){//used to retrieve data in boolean form
//                //now make java pointer variable to get b/c it was on sql form
//                int id=resultSet.getInt("id");
//                String name=resultSet.getString("name");
//                int age=resultSet.getInt("age");
//                double marks=resultSet.getDouble("marks");
//                System.out.println("ID: "+id);
//                System.out.println("NAME: "+name);
//                System.out.println("AGE: "+age);
//                System.out.println("MARKS: "+marks);
//            }
   ////////////////////////////////////////////////////////////////////////////////////////////////////////

            //simple statement we have to change every time query
            //inserting data
//            String query1 = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %.2f)", "Rahul", 11, 45.7);
//            int rowsAffected1=statement.executeUpdate(query1);
//            if(rowsAffected1>0){
//                System.out.println("successflly updated data");
//            }else{
//                System.out.println("Data not updated");
//            }
                //upadting data
//            String query2 = String.format("UPDATE students SET marks=%.2f WHERE id=%d",89.5,2);
//            int rowsAffected2=statement.executeUpdate(query2);
//            if(rowsAffected2>0){
//                System.out.println("successflly updated data");
//            }else{
//                System.out.println("Data not updated");
//            }

//            String query3 = String.format("INSERT INTO students(name, age, marks) VALUES('%s', %d, %.2f)", "Amit", 19, 99.7);
//            int rowsAffected3=statement.executeUpdate(query3);
//            if(rowsAffected3>0){
//                System.out.println("successflly updated data");
//            }else{
//                System.out.println("Data not updated");
//            }

            //deleting data
//            String query4=String.format("DELETE FROM students WHERE ID=5");
//            int rowsAffected4=statement.executeUpdate(query4);
//            if(rowsAffected4>0){
//                System.out.println("successflly updated data");
//            }else{
//                System.out.println("Data not updated");
//            }

////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //prepared statement

////            String query="INSERT INTO students(name,age,marks) VALUES(?,?,?)";
////            String query="SELECT marks FROM students WHERE id=?";
//            String query="UPDATE students SET marks=? where id=?";
//            PreparedStatement preparedStatement=connection.prepareStatement(query); //at this moment query is compiled
////            preparedStatement.setInt(1,1);
//            preparedStatement.setDouble(1,66.99);
//            preparedStatement.setInt(2,2);
//
//            //setting the values
////            preparedStatement.setString(1,"Nidhi");
////            preparedStatement.setInt(2,25);
////            preparedStatement.setDouble(3,77.9);
//
//            int rowsAffected=preparedStatement.executeUpdate();//here query is not used b/c it is already compiled
//            if(rowsAffected>0){
//                System.out.println("successfully updated");
//            }else{
//                System.out.println("not updated");
//            }
//
//            //main retrieval query
////            ResultSet resultSet=preparedStatement.executeQuery();
////            if(resultSet.next()){ //checks if rows are available or not
////                System.out.println("Marks: "+resultSet.getDouble("marks"));
////            }
////            else{
////                System.out.println("Marks not found");
////            }

///////////////////////////////////////////////////////////////////////////////////////////////////////

            //adding data in batches or in group

            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("enter name: ");
                String name=sc.next();
                System.out.println("enter your age: ");
                int age=sc.nextInt();
                System.out.println("enter marks");
                double marks=sc.nextDouble();
                System.out.println("enter more data(Y/N)");
                String choice=sc.next();

                String query=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%d,%.2f)",name,age,marks);
                statement.addBatch(query);
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] arr= statement.executeBatch();






        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

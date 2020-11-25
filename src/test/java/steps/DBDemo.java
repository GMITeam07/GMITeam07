package steps;

import org.junit.Test;
import utilities.DBUtils;
import utilities.DBUtilsNew;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class DBDemo {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    private static ResultSetMetaData rsmd;

    /*  Creates connection before query execution .
     * gets parameter already up in the fields inm this class
     */
    public static Connection createConnection() {
        String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";
        String user = "techprodb_user";
        String password = "Techpro_@126";
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    /*
     * executes a query and outputs a Resultset
     */
    public static ResultSet executeQuery(String query){
        createConnection();
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("\""+query+"\" query did not successfully execute!");

        }
        return resultSet;
    }

    @Test
    public void demo() throws SQLException {

//       boolean result= DBUtilsNew.executeInsertionQuery(
//               "INSERT INTO public.tp_country (name,id) VALUES ('Ghana',567)");
//
//        System.out.println(result);

//        List<Map<String,String>> list=DBUtilsNew.getQueryAsAListOfMaps("select * from public.tp_country");
//
//        list.stream().map(t->t).forEach(System.out::println);

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(2);
        list2.add(2);list2.add(2);list2.add(3);list2.add(4);

        List list3=list1.stream().filter(t-> list2.stream().anyMatch(z->z==t)).collect(Collectors.toList());
        Set set3=list1.stream().filter(t-> list2.stream().anyMatch(z->z==t)).collect(Collectors.toSet());
        System.out.println(list3);
        System.out.println(set3);

    }
}

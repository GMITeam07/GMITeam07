package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelUtil {

    private static Workbook workBook;
    private static Sheet workSheet;
    private static String path;
    public ExcelUtil(){

    }

    public ExcelUtil(String path, String sheetName) {//This Constructor is to open and access the excel file
        this.path = path;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workBook = WorkbookFactory.create(fileInputStream);
            workSheet = workBook.getSheet(sheetName);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void setExcel(String path, String sheetName){
        this.path = path;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workBook = WorkbookFactory.create(fileInputStream);
            workSheet = workBook.getSheet(sheetName);
            fileInputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//===============Getting the number of columns in a specific single row=================
    public int columnCount() {
         //getting how many numbers in row 1
        return workSheet.getRow(0).getLastCellNum();
    }
//===============how do you get the last row number?Index start at 0.====================
    public int rowCount() {
        return workSheet.getLastRowNum() + 1; }

    //==============When you enter row and column number, then you get the data==========
    public String getCellData(int rowNum, int colNum) {
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(colNum);
            String cellData = cell.toString();
            return cellData;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //============getting all data into two dimentional array and returning the data===
    public String[][] getDataArray() {
        String[][] data = new String[rowCount()][columnCount()];
        for (int i = 0; i < rowCount(); i++) {
            for (int j = 0; j < columnCount(); j++) {
                String value = getCellData(i, j);
                data[i][j] = value;
            }
        }
        return data;
    }

    /* This will get the list of the data in the excel file
    List<Map<String,String>> = List<Map<ColumnName,CellData>> => List.get(rownumber).get("columnname")   */
    public List<Map<String, String>> getDataList() {

        // stores column nammes
        List<String> columns = getColumnsNames();

        List<Map<String, String>> data = new ArrayList<>();

        for (int i = 1; i < rowCount(); i++) {
            // get each row
            Row row = workSheet.getRow(i);
            // creating map of the row using the column and value
            // key=column, value=cell
            Map<String, String> rowMap = new HashMap<String, String>();
            for (Cell cell : row) {
                int columnIndex = cell.getColumnIndex();
                rowMap.put(columns.get(columnIndex), cell.toString());
            }
            data.add(rowMap);
        }
        return data;
    }

    /* -----------------Goes to 1st row and reads each row one by one--------------------*/
    public List<String> getColumnsNames() {
        List<String> columns = new ArrayList<>();
        for (Cell cell : workSheet.getRow(0)) {
            columns.add(cell.toString());
        }
        return columns;
    }

    //=========When you enter the row and column number, returning the value===============//
    public void setCellData(String value, int rowNum, int colNum) {
        Cell cell;
        Row row;
        try {
            row = workSheet.getRow(rowNum);
            cell = row.getCell(colNum);
            if (cell == null) {//if there is no value, create a cell.
                cell = row.createCell(colNum);
                cell.setCellValue(value);
            } else {
                cell.setCellValue(value);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            workBook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCellData(String value, String columnName, int row) {
        int column = getColumnsNames().indexOf(columnName);
        setCellData(value, row, column);
    }

}


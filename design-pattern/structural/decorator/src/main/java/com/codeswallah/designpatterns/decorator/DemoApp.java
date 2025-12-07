package com.codeswallah.designpatterns.decorator;

public class DemoApp {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nSam Gill,100000\nTom Joss,912000";

        DataSourceDecorator encodedDataSource = new CompressionDecorator(
                                            new EncryptionDecorator(
                                            new FileDataSource("OutputDemo.txt")));
        encodedDataSource.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded (Reading using plain datasource)--------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encodedDataSource.readData());
    }
}

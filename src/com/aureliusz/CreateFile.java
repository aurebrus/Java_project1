package com.aureliusz;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class CreateFile {
    public void save(String city, String name, String surname, String pesel) {
        try {
            String file_n = pesel + ".txt";
            File file = new File(file_n);


            if (!file.exists() ) {

                if (PESELChecker.check(pesel)) {
                    file.createNewFile();
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(name);
                    pw.println(surname);
                    pw.println(city);
                    pw.println(pesel);

                    pw.close();
                    System.out.println("plik zapisany");
                }
                else {
                    System.out.println("bledny pesel ");
                }
            }
            else {
                System.out.println("plik juz istnieje ");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

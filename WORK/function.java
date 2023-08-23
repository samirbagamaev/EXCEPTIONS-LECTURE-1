//Функция, которая возваращает нам информацию о размере файла на нашем компьютере

import java.io.File;

/**
 * function
 */
public class function {

    public static void main(String[] args) {
        //System.out.println(getFileSize(new File("123"))); //файла 123 не существует
        System.out.println(divide(10,0)); //Выдало ошибку
    }

    public static int divide(int a1, int a2){
        if(a2 == 0){
            return -1;
        }
        return a1/a2;
    }

    //if(file.exists()) если файл не существует
    public static long getFileSize(File file) {
        if(file.exists()){
            return -1;
        }
        return file.length();
    }
}
package FicherosBinariosPersona;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //Creamos un objeto persona.
        Persona persona = new Persona(1, "Alejandro Recarte", 22, "472581525E");

        //Lo exportamos con el método creado.
        try{
            exportarPersona(persona);
        }catch(IOException e){
            e.printStackTrace();
        }

        //Volvemos a recuperarlo e imprimimos su información por pantalla.
        try{
            System.out.println(importarPersona("Persona1").toString());
        }catch (Exception e){
            e.printStackTrace();
        }

        //Modificamos los datos del objeto persona y volvemos a realizar las dos operaciones anteriores.

        persona.setNombre("Inés");
        persona.setEdad(24);

        try{
            exportarPersona(persona);
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            System.out.println(importarPersona("Persona1").toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void exportarPersona(Persona persona) throws IOException{
        //Creamos los recursos FileOutputStream pasando como argumento la ruta que deseamos
        //y el ObjectOutputStream asociado para exportar el objeto.
        FileOutputStream fileWriter = new FileOutputStream("Persona1");
        ObjectOutputStream objectWriter = new ObjectOutputStream(fileWriter);

        //Pasamos por los streams el objeto deseado.
        objectWriter.writeObject(persona);

        //Cerramos los recursos.
        objectWriter.close();
        fileWriter.close();
    }

    public static Persona importarPersona(String path) throws IOException, ClassNotFoundException{
        //Creamos el objeto donde almacenaremos la importación.
        Persona persona;

        //Creamos el recurso FileInputStream pasando como argumento la ruta que deseamos
        //y creamos el ObjectInputStream asociado para importar el objeto.
        FileInputStream fileReader = new FileInputStream(path);
        ObjectInputStream objectReader = new ObjectInputStream(fileReader);

        //Guardamos en nuestro objeto el resultado que nos ofrece el ObjectInputStream.
        persona = (Persona) objectReader.readObject();

        //Cerramos los recursos.
        objectReader.close();
        fileReader.close();

        //Devolvemos el objeto persona resultante.
        return persona;
    }
}

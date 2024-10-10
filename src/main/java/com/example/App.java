package com.example;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Empleado[] empleadosArray = {
            Empleado.builder()
                .nombre("Luis")
                .primerApellido("Garcia")
                .segundoApellido("Martinez")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.INFORMATICA)
                .salario(3100.40)
                .build(),
            Empleado.builder()
                .nombre("Susana")
                .primerApellido("Fernandez")
                .segundoApellido("Perez")
                .genero(Genero.MUJER)
                .departamento(Departamento.RRHH)
                .salario(1200.70)
                .build(),
            Empleado.builder()
                .nombre("Carlos")
                .primerApellido("Muñoz")
                .segundoApellido("Sanz")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.INFORMATICA)
                .salario(2600.50)
                .build(),
            Empleado.builder()
                .nombre("Ana")
                .primerApellido("Fernandez")
                .segundoApellido("Ruiz")
                .genero(Genero.MUJER)
                .departamento(Departamento.CONTABILIDAD)
                .salario(1300.70)
                .build(),
            Empleado.builder()
                .nombre("Laura")
                .primerApellido("Salas")
                .segundoApellido("Paz")
                .genero(Genero.MUJER)
                .departamento(Departamento.CONTABILIDAD)
                .salario(2240.10)
                .build()
        };
           

        double salarioMedio = 0;
        double sumatoriaSalarios = 0;
        int totalEmpleados = 0;
        
        for (Empleado empleado : empleadosArray) {
        sumatoriaSalarios += empleado.getSalario();
        ++totalEmpleados;
        }
        salarioMedio = sumatoriaSalarios / totalEmpleados;
            
        System.out.println("Empleados del genero Mujer, con salario superior a la media");
            for (Empleado empleado : empleadosArray) {
                if (empleado.getGenero().equals(Genero.MUJER) &&
                    empleado.getSalario() > salarioMedio)
                 System.out.println(empleado.toString());
            
        };


        List<? super Persona> empleadosYEstudiantes;

        empleadosYEstudiantes = new ArrayList<>();

        // Agregar empleados        
        empleadosYEstudiantes.add(
           Empleado.builder()
                .nombre("Paco")
                .primerApellido("Martinez")
                .segundoApellido("Garcia")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.CONTABILIDAD)
                .salario(3100.40)
                .build()
        );
        empleadosYEstudiantes.add(
            Empleado.builder()
                .nombre("Maria")
                .primerApellido("Perez")
                .segundoApellido("Perez")
                .genero(Genero.MUJER)
                .departamento(Departamento.RRHH)
                .salario(1400.70)
                .build()
        );
        empleadosYEstudiantes.add(
            Empleado.builder()
                .nombre("Francisco")
                .primerApellido("Casas")
                .segundoApellido("Torres")
                .genero(Genero.HOMBRE)
                .departamento(Departamento.INFORMATICA)
                .salario(2510.50)
                .build()
        );
        empleadosYEstudiantes.add(        
            Empleado.builder()
                .nombre("Luisa")
                .primerApellido("Gomez")
                .segundoApellido("Villa")
                .genero(Genero.MUJER)
                .departamento(Departamento.INFORMATICA)
                .salario(1710.50)
                .build()
        );
        empleadosYEstudiantes.add(  
            Empleado.builder()
                .nombre("Cruz")
                .primerApellido("Nuñez")
                .segundoApellido("Rio")
                .genero(Genero.MUJER)
                .departamento(Departamento.INFORMATICA)
                .salario(1810.80)
                .build()
        );
        
        // Agregar estudiantess  
        empleadosYEstudiantes.add(  
            Estudiante.builder()
                .nombre("Sara")
                .primerApellido("Garcia")
                .segundoApellido("Garcia")
                .genero(Genero.MUJER)
                .facultad(Facultad.MEDICINA)
                .totalAsignaturasMatriculadas(9)
                .build()
        );
        empleadosYEstudiantes.add(  
            Estudiante.builder()
                .nombre("Antonio")
                .primerApellido("Lopez")
                .segundoApellido("Gonzalez")
                .genero(Genero.HOMBRE)
                .facultad(Facultad.CAMINOS)
                .totalAsignaturasMatriculadas(8)
                .build()
        );
        empleadosYEstudiantes.add(  
            Estudiante.builder()
                .nombre("Carmen")
                .primerApellido("Rodriguez")
                .segundoApellido("Diaz")
                .genero(Genero.MUJER)
                .facultad(Facultad.GEOLOGIA)
                .totalAsignaturasMatriculadas(11)
                .build()
        );
        empleadosYEstudiantes.add(  
            Estudiante.builder()
                .nombre("Mario")
                .primerApellido("Martinez")
                .segundoApellido("Val")
                .genero(Genero.HOMBRE)
                .facultad(Facultad.MATEMATICAS)
                .totalAsignaturasMatriculadas(10)
                .build()
        );
        empleadosYEstudiantes.add(  
            Estudiante.builder()
                .nombre("Marta")
                .primerApellido("Masa")
                .segundoApellido("Camino")
                .genero(Genero.MUJER)
                .facultad(Facultad.MATEMATICAS)
                .totalAsignaturasMatriculadas(13)
                .build()
        );

        

    }
}

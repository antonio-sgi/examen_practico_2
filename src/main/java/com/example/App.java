package com.example;


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




        
    }
}

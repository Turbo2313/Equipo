package trabajo_practico;

import java.util.ArrayList;
import java.util.Scanner;



public class Equipo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner (System.in);
		Equipo equipo = new Equipo ("Talleres", 11, 7,"Javier Gandolfi" , 21, 13);

		equipo.agregarEquipo("Talleres", 11, 7,"Javier Gandolfi" , 21, 13);

		equipo.agregarEquipo("Belgrano", 11, 7,"Guillermo Farre" , 24, 13);

		equipo.agregarEquipo("San Lorenzo", 11, 7,"Dario Insua" , 11, 14);

		equipo.agregarEquipo("River Plate", 11, 7,"Martin Demichelos" , 33, 13);

		ArrayList<Equipo> equipos = equipo.getEquipos();
		int seleccion = -1 ;

		while (seleccion != 0) {
		    System.out.println("Ingrese el número del equipo que desea imprimir o 0 para salir:");
			
		    for (int i = 0; i < equipos.size(); i++) {
		        System.out.println((i + 1) + ". " + equipos.get(i).getNombre());
		    }
		    seleccion = tec.nextInt();

		    if (seleccion == 0) {
		        System.out.println("Saliendo del programa...");
		    } else if (seleccion < 1 || seleccion > equipos.size()) {
		        System.out.println("Número de equipo no válido. Ingrese un número entre 1 y " + equipos.size());
		    } else {
		        equipos.get(seleccion - 1).imprimirEquipo();
		        
		    }
		    // imprimimos todos los equipos como listado 
		}
		    	

		    		       equipo.imprimirListaEquipos(equipos);	
		 
		    
		}

		


			
			
		private String nombre;
		private int titulares;
		private int suplentes;
		private String directorTecnico;
		private int puntos;
		private int partidosJugados;
		private ArrayList <Equipo> equipos ;

		public Equipo () {
			
		}
		public Equipo (String nombre, int titulares, int suplentes,String directorTecnico, int puntos, int partidosJugados) {
			
			this.nombre=nombre;
			this.titulares=titulares;
			this.suplentes=suplentes ;
			this.directorTecnico=directorTecnico ;
			this.puntos=puntos;
			this.partidosJugados=partidosJugados;
			this.equipos= new ArrayList <>();
			
		}
		public ArrayList<Equipo> getEquipos () {
			return equipos;
		}
		public int getPartidosJugados () {
			return partidosJugados ;
		}
		public void setPartidosJugados (int partidos) {
			this.partidosJugados=partidos ;
		}
		public String getNombre () {
			return nombre;
		}
		public int getTitulares () {
			return titulares;
		}
		public int getSuplentes () {
			return suplentes ;
			
		}
		public String getDirectorTecnico () {
			return directorTecnico ;
		}
		public int getPuntos () {
			return puntos;
		}
		public void setNombre (String nombre) {
			this.nombre=nombre;
		}
		public void setTitulares (int titulares) {
			this.titulares= titulares;
		}
		public void setSuplentes (int suplentes ) {
			this.suplentes=suplentes;
		}
		public void setDirectorTecnico (String directorTecnico) {
			this.directorTecnico=directorTecnico;
		}
		public void agregarEquipo (String nombre, int titulares, int suplentes , String directorTecnico, int puntos, int partidosJugados) {
			equipos.add(new Equipo (nombre,titulares,suplentes,directorTecnico,puntos,partidosJugados));
			
		}
		public void imprimirEquipo () {
			if ( nombre ==null) {
				System.out.println("Nombre:");
				
			
			} else { System.out.println ("Nombre : " + nombre);
			}
			
			System.out.println("Titulares  : " + titulares);
			System.out.println("Suplentes  : " + suplentes);
			if (directorTecnico==null) {
				
				System.out.println("Director tecnico :");
			} else { System.out.println("Director tecnico : " + directorTecnico );}
			System.out.println("Puntos :" + puntos );
			System.out.println("Partidos jugados :" + partidosJugados);
		}
		public void imprimirListaEquipos (ArrayList <Equipo> equipos ) {
			for (int i =0; i < equipos.size();i++) {
				
				System.out.println((i+1)+ "." + equipos.get(i).getNombre());
			}
			
		}
		}

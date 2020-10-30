package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Futbolista;

public class FutbolistaDAOArrayList implements FutbolistaDAO {

	// Constante para listar mayor o menor de...
	static final private String MAYOR = ">";
	static final private String MENOR = "<";

	ArrayList<Futbolista> futs = new ArrayList<Futbolista>();

	@Override
	public ArrayList<Futbolista> listar() throws Exception {
		if (futs != null && futs.size() == 0) {

			for (int i = 0; i < 25; i++) {
				futs.add(new Futbolista());
				futs.get(i).setId(i);
			}

			// pos 0
			futs.get(0).setNombre("Lionel Andrés Messi Cuccitini");
			futs.get(0).setEdad(33);
			futs.get(0).setAltura(1.7f);
			futs.get(0).setNacionalidad("Argentina");
			futs.get(0).setEquipo("FC Barcelona");

			// pos 1
			futs.get(1).setNombre("Kylian Sanmi Mbappé Lotin");
			futs.get(1).setEdad(21);
			futs.get(1).setAltura(1.78f);
			futs.get(1).setNacionalidad("Francia");
			futs.get(1).setEquipo("PSG");

			// pos 2
			futs.get(2).setNombre("Cristiano Ronaldo dos Santos Aveiro");
			futs.get(2).setEdad(35);
			futs.get(2).setAltura(1.87f);
			futs.get(2).setNacionalidad("Portugal");
			futs.get(2).setEquipo("Juventus");

			// pos 3
			futs.get(3).setNombre("Marc-André ter Stegen");
			futs.get(3).setEdad(28);
			futs.get(3).setAltura(1.87f);
			futs.get(3).setNacionalidad("Alemania");
			futs.get(3).setEquipo("FC Barcelona");

			// pos 4
			futs.get(4).setNombre("Gerard Piqué i Bernabeu");
			futs.get(4).setEdad(33);
			futs.get(4).setAltura(1.92f);
			futs.get(4).setNacionalidad("España");
			futs.get(4).setEquipo("FC Barcelona");

			// pos 5
			futs.get(5).setNombre("Luis Alberto Suárez Díaz");
			futs.get(5).setEdad(33);
			futs.get(5).setAltura(1.82f);
			futs.get(5).setNacionalidad("Uruguay");
			futs.get(5).setEquipo("Atlético de Madrid");

			// pos 6
			futs.get(6).setNombre("Jan Oblak");
			futs.get(6).setEdad(27);
			futs.get(6).setAltura(1.88f);
			futs.get(6).setNacionalidad("Eslovenia");
			futs.get(6).setEquipo("Atlético de Madrid");

			// pos 7
			futs.get(7).setNombre("Eden Michael Hazard");
			futs.get(7).setEdad(29);
			futs.get(7).setAltura(1.75f);
			futs.get(7).setNacionalidad("Bélgica");
			futs.get(7).setEquipo("Real Madrid");

			// pos 8
			futs.get(8).setNombre("Sergio Busquets i Burgos");
			futs.get(8).setEdad(32);
			futs.get(8).setAltura(1.89f);
			futs.get(8).setNacionalidad("España");
			futs.get(8).setEquipo("FC Barcelona");

			// pos 9
			futs.get(9).setNombre("Sergio Ramos García");
			futs.get(9).setEdad(34);
			futs.get(9).setAltura(1.84f);
			futs.get(9).setNacionalidad("España");
			futs.get(9).setEquipo("Real Madrid");

			// pos 10
			futs.get(10).setNombre("N'Golo Kanté");
			futs.get(10).setEdad(29);
			futs.get(10).setAltura(1.68f);
			futs.get(10).setNacionalidad("Francia");
			futs.get(10).setEquipo("Chelsea");

			// pos 11
			futs.get(11).setNombre("Kevin de Bruyne");
			futs.get(11).setEdad(29);
			futs.get(11).setAltura(1.81f);
			futs.get(11).setNacionalidad("Bélgica");
			futs.get(11).setEquipo("Manchester City");

			// pos 12
			futs.get(12).setNombre("Luka Modric");
			futs.get(12).setEdad(35);
			futs.get(12).setAltura(1.72f);
			futs.get(12).setNacionalidad("Croacia");
			futs.get(12).setEquipo("Real Madrid");

			// pos 13
			futs.get(13).setNombre("Neymar da Silva Santos Júnior");
			futs.get(13).setEdad(28);
			futs.get(13).setAltura(1.75f);
			futs.get(13).setNacionalidad("Brasil");
			futs.get(13).setEquipo("PSG");

			// pos 14
			futs.get(14).setNombre("Frenkie de Jong");
			futs.get(14).setEdad(23);
			futs.get(14).setAltura(1.81f);
			futs.get(14).setNacionalidad("Países Bajos");
			futs.get(14).setEquipo("FC Barcelona");

			// pos 15
			futs.get(15).setNombre("Mohamed Salah");
			futs.get(15).setEdad(28);
			futs.get(15).setAltura(1.75f);
			futs.get(15).setNacionalidad("Egipto");
			futs.get(15).setEquipo("Liverpool");

			// pos 16
			futs.get(16).setNombre("Harry Edward Kane");
			futs.get(16).setEdad(27);
			futs.get(16).setAltura(1.88f);
			futs.get(16).setNacionalidad("Inglaterra");
			futs.get(16).setEquipo("Tottenham Hotspurs");

			// pos 17
			futs.get(17).setNombre("Antoine Griezmann");
			futs.get(17).setEdad(29);
			futs.get(17).setAltura(1.76f);
			futs.get(17).setNacionalidad("Francia");
			futs.get(17).setEquipo("FC Barcelona");

			// pos 18
			futs.get(18).setNombre("Karim Benzema");
			futs.get(18).setEdad(32);
			futs.get(18).setAltura(1.84f);
			futs.get(18).setNacionalidad("Francia");
			futs.get(18).setEquipo("Real Madrid");

			// pos 19
			futs.get(19).setNombre("Virgil van Dijk");
			futs.get(19).setEdad(29);
			futs.get(19).setAltura(1.93f);
			futs.get(19).setNacionalidad("Países Bajos");
			futs.get(19).setEquipo("Liverpool");

			// pos 20
			futs.get(20).setNombre("Sadio Mané");
			futs.get(20).setEdad(28);
			futs.get(20).setAltura(1.74f);
			futs.get(20).setNacionalidad("Senegal");
			futs.get(20).setEquipo("Liverpool");

			// pos 21
			futs.get(21).setNombre("Sergio Leonel Agüero del Castillo");
			futs.get(21).setEdad(32);
			futs.get(21).setAltura(1.73f);
			futs.get(21).setNacionalidad("Argentina");
			futs.get(21).setEquipo("Manchester City");

			// pos 22
			futs.get(22).setNombre("Paul Labile Pogba");
			futs.get(22).setEdad(27);
			futs.get(22).setAltura(1.91f);
			futs.get(22).setNacionalidad("Francia");
			futs.get(22).setEquipo("Manchester United");

			// pos 23
			futs.get(23).setNombre("Raheem Shaquille Sterling");
			futs.get(23).setEdad(25);
			futs.get(23).setAltura(1.7f);
			futs.get(23).setNacionalidad("Inglaterra");
			futs.get(23).setEquipo("Manchester City");

			// pos 24
			futs.get(24).setNombre("Christian Dannemann Eriksen");
			futs.get(24).setEdad(28);
			futs.get(24).setAltura(1.82f);
			futs.get(24).setNacionalidad("Dinamarca");
			futs.get(24).setEquipo("Inter de Milán");
		}
		return futs;
	}

	@Override
	public Futbolista getFutbolista(int id) {
		Futbolista futbolista = new Futbolista();
		futbolista.setId(-1);
		for (Futbolista fut : futs) {
			if (fut.getId() == id) {
				futbolista = fut;
			}
		}
		if (futbolista.getId() != -1) {
			return futbolista;
		} else {
			return null;
		}
	}

	@Override
	public Futbolista nuevoFutbolista(Futbolista fut) throws Exception {
		int idFut = -1;

		// Coger el id del siguiente futbolista
		for (Futbolista futbolista : futs) {
			if (idFut < futbolista.getId()) {
				idFut = futbolista.getId();
			}
		}
		fut.setId(idFut + 1);

		futs.add(fut);

		return fut;
	}

	@Override
	public ArrayList<Futbolista> buscarFutbolistaPorNombre(String busqueda) {
		ArrayList<Futbolista> futCoinciden = new ArrayList<Futbolista>();

		for (Futbolista fut : futs) {
			if (fut.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
				futCoinciden.add(fut);
			}
		}
		return futCoinciden;
	}

	@Override
	public Futbolista modificarFutbolista(Futbolista fut) throws Exception {
		int index = 0;

		if (this.getFutbolista(fut.getId()) != null) {
			throw new Exception("No existe el futbolista");
		}

		for (int i = 0; i < futs.size(); i++) {
			if (futs.get(i).getId() == fut.getId()) {
				index = i;
			}
		}
		futs.set(index, fut);
		return fut;
	}

	@Override
	public boolean borrarFutbolista(int id) {
		int index = 0;

		if (this.getFutbolista(id) == null) {
			return false;
		}

		for (int i = 0; i < futs.size(); i++) {
			if (futs.get(i).getId() == id) {
				index = i;
			}
		}
		futs.remove(index);
		return true;
	}

	@Override
	public ArrayList<Futbolista> getFutbolistaNacionalidad(String nacionalidad) {
		ArrayList<Futbolista> futsNacion = new ArrayList<Futbolista>();

		for (Futbolista fut : futs) {
			if (nacionalidad.equalsIgnoreCase(fut.getNacionalidad())) {
				futsNacion.add(fut);
			}
		}
		return futsNacion;
	}

	@Override
	public ArrayList<Futbolista> getFutbolistaMayorMenorEdad(int edad, String mayorMenor) throws Exception {

		ArrayList<Futbolista> arrayFutOrdenadoPorEdad = new ArrayList<Futbolista>();

		switch (mayorMenor) {
		case MAYOR:
			for (Futbolista fut : futs) {
				if (fut.getEdad() > edad) {
					arrayFutOrdenadoPorEdad.add(fut);
				}
			}
			break;

		case MENOR:
			for (Futbolista fut : futs) {
				if (fut.getEdad() < edad) {
					arrayFutOrdenadoPorEdad.add(fut);
				}
			}
			break;

		default:
			throw new Exception("Sólo puede introducir los siguientes caracteres: <, >");
		}
		return arrayFutOrdenadoPorEdad;
	}

	public ArrayList<Futbolista> ordenarPorEdad(ArrayList<Futbolista> futs) {
		Futbolista temp;
		for (int i = 0; i < futs.size() - 1; i++) {
			for (int j = i + 1; j < futs.size(); j++) {
				if (futs.get(i).getEdad() > futs.get(j).getEdad()) {
					temp = futs.get(i);
					futs.set(i, futs.get(j));
					futs.set(j, temp);
				}
			}
		}
		return futs;
	}

	public void ordenarArray() {

		Futbolista temp = new Futbolista();
		for (int i = 0; i < futs.size() - 1; i++) {
			for (int j = i + 1; j < futs.size(); j++) {
				if (futs.get(i).getNombre().compareTo(futs.get(j).getNombre()) > 0) {
					temp = futs.get(i);
					futs.set(i, futs.get(j));
					futs.set(j, temp);
				}
			}
		}
	}

}

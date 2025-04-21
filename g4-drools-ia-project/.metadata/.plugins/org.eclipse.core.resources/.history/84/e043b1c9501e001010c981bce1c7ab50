package utils;

import model.Automovil;
import model.Bateria;
import model.Recomendacion;
import model.AccionRecomendada;
import model.ResultadoDiagnosticoPreliminar;
import model.Motor;
import model.TanqueCombustible;

public class TestCaseUtils {

	////////////////TEST CASES UTILS ////////////////

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}

	public static void print(Automovil automovil) {

		Motor motor = automovil.getMotor();
		Bateria bateria = automovil.getBateria();
		TanqueCombustible tanque = automovil.getTanque();

		print();
		print("Vehiculo");
		print("Motor: " + motor);
		print("Bateria: " + bateria);
		print("Tanque: " + tanque);
		print();
	}

	public static void assertResults(Recomendacion recomendacion, AccionRecomendada valorEsperado) {
		AccionRecomendada accion = recomendacion.getAccion();
		printResults(accion.toString(), valorEsperado.toString());
		assert(accion.isa(valorEsperado));
	}

	private static void printResults(String result,String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: "+ condition);
	}
}

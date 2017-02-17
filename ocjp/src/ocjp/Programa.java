package ocjp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {

		LocalDate pai = LocalDate.of(1990, 3, 6);
		LocalDate filha = LocalDate.of(2009, 8, 8);
		LocalDate hoje = LocalDate.now(ZoneId.systemDefault());

		System.out.println("Aniversário da filha: " + filha);
		System.out.println("Aniversário do pai: " + pai);

		System.out.println("A diferença de idades é de: " + Period.between(pai, filha).getYears() + ", anos "
				+ Period.between(pai, filha).getMonths() + " messes e " + Period.between(pai, filha).getDays()
				+ "dias");

		System.out.println("evolução de idades:");

		int i = 0;

		Period idadePai = Period.between(pai, hoje);
		Period idadeFilha = Period.between(filha, hoje);

		System.out.println("idade pai " + idadePai.getYears());
		System.out.println("idade pai " + idadeFilha.getYears());

		while (i <= 51) {

			System.out.print("idade pai " + idadePai.plusYears(i).getYears());
			System.out.println(" idade filha " + idadeFilha.plusYears(i).getYears() + " após " + i +" anos");
			
			i++;

		}

	}

}

package com.lolo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.lolo.*.mapper")
public class FoxOfCanLoloApplication {

	@RequestMapping("/boot")
	public String index() {
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(FoxOfCanLoloApplication.class, args);
		System.out.println("      ___           ___           ___           ___           ___           ___              \n" +
				"     /\\  \\         /\\  \\         |\\__\\         /\\__\\         /\\  \\         /\\__\\             \n" +
				"    /::\\  \\       /::\\  \\        |:|  |       /::|  |       /::\\  \\       /::|  |            \n" +
				"   /:/\\:\\  \\     /:/\\:\\  \\       |:|  |      /:|:|  |      /:/\\:\\  \\     /:|:|  |            \n" +
				"  /::\\~\\:\\  \\   /:/  \\:\\  \\      |:|__|__   /:/|:|__|__   /::\\~\\:\\  \\   /:/|:|  |__          \n" +
				" /:/\\:\\ \\:\\__\\ /:/__/ \\:\\__\\ ____/::::\\__\\ /:/ |::::\\__\\ /:/\\:\\ \\:\\__\\ /:/ |:| /\\__\\         \n" +
				" \\/__\\:\\ \\/__/ \\:\\  \\ /:/  / \\::::/~~/~    \\/__/~~/:/  / \\/__\\:\\/:/  / \\/__|:|/:/  /         \n" +
				"      \\:\\__\\    \\:\\  /:/  /   ~~|:|~~|           /:/  /       \\::/  /      |:/:/  /          \n" +
				"       \\/__/     \\:\\/:/  /      |:|  |          /:/  /        /:/  /       |::/  /           \n" +
				"                  \\::/  /       |:|  |         /:/  /        /:/  /        /:/  /            \n" +
				"                   \\/__/         \\|__|         \\/__/         \\/__/         \\/__/             \n" +
				"      ___           ___           ___           ___           ___                            \n" +
				"     /\\  \\         /\\  \\         /\\  \\         /\\  \\         /\\  \\                           \n" +
				"    /::\\  \\        \\:\\  \\       /::\\  \\       /::\\  \\        \\:\\  \\                          \n" +
				"   /:/\\ \\  \\        \\:\\  \\     /:/\\:\\  \\     /:/\\:\\  \\        \\:\\  \\                         \n" +
				"  _\\:\\~\\ \\  \\       /::\\  \\   /::\\~\\:\\  \\   /::\\~\\:\\  \\       /::\\  \\                        \n" +
				" /\\ \\:\\ \\ \\__\\     /:/\\:\\__\\ /:/\\:\\ \\:\\__\\ /:/\\:\\ \\:\\__\\     /:/\\:\\__\\                       \n" +
				" \\:\\ \\:\\ \\/__/    /:/  \\/__/ \\/__\\:\\/:/  / \\/_|::\\/:/  /    /:/  \\/__/                       \n" +
				"  \\:\\ \\:\\__\\     /:/  /           \\::/  /     |:|::/  /    /:/  /                            \n" +
				"   \\:\\/:/  /     \\/__/            /:/  /      |:|\\/__/     \\/__/                             \n" +
				"    \\::/  /                      /:/  /       |:|  |                                         \n" +
				"     \\/__/                       \\/__/         \\|__| ");
	}

}

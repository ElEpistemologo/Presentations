package com.verifieurfou.presentations.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PureFonction {

	/**
	 * 	FUNCTIONAL IN NATURE
	 */
	
	static List<String> source = List.of("Valentin", "Guillaume", "Maxime", "Romain", "Jéjé", "Juju");
	
	// Utilise les stream sans le paradigme
	
	static List<String> no() {
		var dont = new ArrayList<String>();
		new ArrayList<String>();
		source.stream()
			.filter(str -> str.length() > 4)
			.forEach(str -> dont.add(str));
		return dont;
	}
	
	// Utilise les stream avec le paradigme
	
	static List<String> yes() {
		return source.stream()
				.filter(str -> str.length() > 4)
				.collect(Collectors.toList());
//				.toList();
	}
	
	// "Les effets de bords sont généralement découragés" (doc package java.util.stream)
	// un effet de bord pourrait ne même pas être exécuter de part la nature "lazy-seeking" des implémentations des streams
	
	
	
	// "Le résultat d'un stream peut être non détérministe ou incorrect si les functions du stream sont stateful" (doc package java.util.stream)

	static String exteriorState = "coucou";
	
	Function<Object, String> stateful = o -> o.toString() + exteriorState;
	
	BiFunction<Object, String, String> stateless = (o, constante) -> o.toString() + constante;
	
	/**
	 * Définition de "function pure" (The well-grounded Java Developers, 2nd éd. B.Evans, J.Clark, M.Verburg, p498)
	 * 
	 * "Une fonction pure est une fonction qui ne modifie pas l'état d'aucune autre entité. Elle est dite sans effet de bord, ce qui
	 * signifie qu'une fonction se comporte comme une fonction mathématique: elle prend un argument, ne les affectent d'aucune manière,
	 * et retour ne un résultat qui ne dépend que des valeurs passées en paramètres "
	 * 
	 * 
	 * Définition de méthode "pure" pour un language JVM (The well-grounded Java Developers, 2nd éd. B.Evans, J.Clark, M.Verburg, p503)
	 * 
	 * "Une méthode pure pour un language pour la JVM est une méthode qui à les caractéristiques suivantes:
	 *  - Ne modifie pas d'object ou d'état statique (ne contient pas de putfield ou putstatic)
	 *  - Ne dépend pas d'object externe mutable ou d'état statique
	 *  - N'appelle pas de méthode non-pure" 
	 * 
	 * Autre définition: (Functional Thinking, Neal Ford, 2014, O'Reilly, p59)
	 * 
	 * "Une fonction pure est une fonction qui n'a aucun effet de bord: elle ne fait référence à aucune attribut de classe mutable,
	 * ne modifie aucune valeur autre que celle qu'elle retourne, et ne dépend que de ses paramètres" 
	 * 
	 * 
	 * J. Bloch, Effective Java, p210:
	 * "La partie importante du paradigme des stream est de structurer les traitements comme séquences de transformations ou le résultat de chaque étape est
	 * aussi proche que possible de l'exécution d'une fonction pure sur l'étape précédente"
	 * 
	 * 
	 * "Essayer d'utiliser des aproches immutables des états en Java est comme renfouler un bateau avec des fuites" (The well-grounded Java Developers, 2nd éd. B.Evans, J.Clark, M.Verburg, p505) 
	 * (par exemple: pas d'interface à au niveau dans la hiérarchie des Collection pour discriminer collections mutables et immutable)
	 * 
	 */
}

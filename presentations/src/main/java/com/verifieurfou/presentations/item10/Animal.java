package com.verifieurfou.presentations.item10;

import com.google.auto.value.AutoValue;
import com.verifieurfou.presentations.item10.AutoValue_Animal;

@AutoValue
abstract class Animal {
  static Animal create(String name, int numberOfLegs) {
    return new AutoValue_Animal(name, numberOfLegs); 
//	  return null;
  }

  abstract String name();
  abstract int numberOfLegs();
}

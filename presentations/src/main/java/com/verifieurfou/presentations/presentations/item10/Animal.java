package com.verifieurfou.presentations.presentations.item10;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Animal {
  static Animal create(String name, int numberOfLegs) {
    return new AutoValue_Animal(name, numberOfLegs); 
//	  return null;
  }

  abstract String name();
  abstract int numberOfLegs();
}

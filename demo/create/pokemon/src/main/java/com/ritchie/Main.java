package com.ritchie;

import com.ritchie.formula.Trainer;

public class Main {

  public static void main(String[] args) {
    final String trainerName = System.getenv("TRAINER_NAME");
    final Trainer trainer = new Trainer(trainerName);

    final String starterPokemon = System.getenv("STARTER_POKEMON");
    trainer.capturePokemon(starterPokemon);

    trainer.go();
  }
}

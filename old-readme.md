# Mastermind
 
Game based on the [Mastermind game](https://en.wikipedia.org/wiki/Mastermind_(board_game))

## Rules
* A player chooses 4 colours (more in a future. Maybe)
* Colours: r b y g o p red blue yellow green orange purple
* Not repeated
* Dead (black) Same colour, same position
* Injured (white) Same colour, different position
* You with 10 tries

## Versions
What have been done in each version of the game.

### Version 1.0.0
The game is playable, playable meaning you can start, try your combinations and if it is the secret one, win the game.

A normal game would go this way:

```
Colour Code : rbygop
Enter your guess : rbgy
Guess: [red, blue, green, yellow] injured is 2   dead is 1
Colour Code : rbygop
Enter your guess : aaaaa
Must enter 4 letters
Colour Code : rbygop
Enter your guess : abab
Invalid Colour
...
Colour Code : rbygop
Enter your guess : oprb
Guess: [orange, purple, red, blue] injured is 3   dead is 3
Colour Code : rbygop
Enter your guess : opry
Guess: [orange, purple, red, yellow] injured is 4   dead is 4
Good Job! The solution is : 
[orange, purple, red, yellow]

```

**Structure**

The game is just one single class that contains all the attributes and methods of the game.

![Class diagram Version 1.0.0](/Sources/version1.0.0.png)

**About this version**

although the game is playable and you can complete a match there are some things wrong:

* There is no trying limit, when it should be 10.
* The structure of just one class is not the suitable because it is hard to read and understand the whole game. It should be done with more classes that interact with each others.
* The game does not show the precious combinations in the window, it just shows the last combination.
* There should be some kind of replayability


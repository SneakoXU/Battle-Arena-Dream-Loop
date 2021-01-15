# Battle-Arena-Dream-Loop

Found this exercise/project idea from John Scott Tremaine on BreakingITDown.net. From his post:

For this exercise, you are going to trap your user in a dream loop. The dream will repeat over and over. There is no way to escape it except to close the application


<b>Set-Up</b>

In the dream, the user finds themselves trapped in a battle arena. They have two stats that determine their survival

1. Stamina – starts at 10. If it reaches 0, the user dies

2. Panic Level – starts at 10. If it reaches 20, the user dies

In the arena, the user must battle enemies. The enemy starts with 10 hit points and dies when that reaches 0. 


<b>Dice Roll</b>

The user does battle by rolling a die each turn (int diceRoll = new Random().Next(1, 7);). 

The following list details the effect of each roll.


1 – The user gets hit, and their panic level increases by 2

2 – The user dodges the attack, but their stamina is reduced by 1

3 – The user deflects the attack. There is no stat change

4 – The enemy backs away; the user’s stamina increases by 1

5 – The enemy dodges, but the user strikes a glancing blow. The user’s panic is reduced by 1. The enemy loses 3 hit points. 

6 – The enemy takes significant damage. The user’s panic is reduced by 3. Their stamina is increased by 2. The enemy loses 5 hit points. 


The user has 10 rolls of the die to defeat the enemy. 


<b>Battle Results</b>

After every roll, if the enemy has not died, the user’s panic increases by 1. Their stamina is reduced by 1. 


If the enemy has died, another enemy enters the arena. The player’s panic and stamina stay where it is. 


If the player has run out of turns, their panic reaches the max level. 

If the player has died, the dream starts over from the beginning. 




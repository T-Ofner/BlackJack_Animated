# BlackJack

<p align="left">
  <img src="resources/icon.png" alt="BlackJack icon" width="225">
</p>

Try to finish the round with a hand value closer to `21` than the dealer without going over `21`.

Going over `21` is a bust.

## Controls

| Control      | What it does                                     |
|--------------|--------------------------------------------------|
| `Hit`        | Draws one card for the player.                   |
| `Stay`       | Ends the player's turn and lets the dealer draw. |
| `Reset`      | Starts a fresh round with a new shuffled deck.   |
| `Background` | Changes the table color.                         |

## Round Flow

1. A 52-card deck is shuffled.
2. The player is dealt two cards.
3. The dealer is dealt one card.
4. The player chooses `Hit` or `Stay`.
5. After `Stay`, the dealer draws until the dealer's score is at least `17`.
6. The final scores and result are shown on the table.

## Card Values

| Card             | Value                                                      |
|------------------|------------------------------------------------------------|
| `2` through `10` | Face value                                                 |
| `J`, `Q`, `K`    | `10`                                                       |
| `A`              | Starts as `11`, then becomes `1` if needed to avoid a bust |

## Player Turn

Use `Hit` to take another card.

The `Hit` button becomes disabled when either:

| Condition                 | Result                                                         |
|---------------------------|----------------------------------------------------------------|
| Your score goes over `21` | You have busted. Press `Stay` to finish and show the result.   |
| You reach `7` cards       | You cannot draw more cards this round. Press `Stay` to finish. |

Use `Stay` when you want to stop drawing cards. This disables both `Hit` and `Stay`, runs the dealer turn, and reveals the final result.

## Dealer Turn

After you press `Stay`, the dealer draws cards while the dealer's score is below `17`.

The dealer stops drawing as soon as the dealer score is `17` or higher.

## Winning And Losing

After the dealer turn, the game compares the final totals:

| Result         | When it happens                                                    |
|----------------|--------------------------------------------------------------------|
| `Bust!`        | Your score is over `21`.                                           |
| `You Win!`     | The dealer busts, or your score is higher than the dealer's score. |
| `Dealer Wins!` | The dealer's score is higher than your score.                      |
| `Push!`        | Your score and the dealer's score are equal.                       |

After a result is shown, use `Reset` to play another round.

This project is a simplified BlackJack game. These casino features are not currently implemented:

- Betting or chips.
- Splitting pairs.
- Doubling down.
- Insurance.
- Surrender.
- Blackjack bonus payouts.
- Multiple players.
- Multiple decks.

## Screen Layout

| Area               | Description                                                      |
|--------------------|------------------------------------------------------------------|
| Top row            | Dealer cards.                                                    |
| Bottom row         | Player cards.                                                    |
| Bottom controls    | `Hit`, `Stay`, and `Reset`.                                      |
| Top-right menu     | Table background color selector.                                 |
| Center result text | Final dealer score, player score, and round result after `Stay`. |
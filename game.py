import random

def play_game():
    """Main game function"""
    print("=" * 50)
    print("  WELCOME TO NUMBER GUESSING GAME!")
    print("=" * 50)
    
    # Select difficulty
    print("\nChoose difficulty level:")
    print("1. Easy (1-50, 10 attempts)")
    print("2. Medium (1-100, 7 attempts)")
    print("3. Hard (1-500, 5 attempts)")
    
    while True:
        choice = input("\nEnter (1/2/3): ").strip()
        if choice in ['1', '2', '3']:
            break
        print("Invalid input! Please enter 1, 2, or 3.")
    
    # Set parameters based on difficulty
    if choice == '1':
        max_num = 50
        attempts = 10
        level = "Easy"
    elif choice == '2':
        max_num = 100
        attempts = 7
        level = "Medium"
    else:
        max_num = 500
        attempts = 5
        level = "Hard"
    
    # Generate random number
    secret_number = random.randint(1, max_num)
    guesses = []
    
    print(f"\n🎮 Starting {level} mode!")
    print(f"Guess a number between 1 and {max_num}")
    print(f"You have {attempts} attempts!\n")
    
    # Game loop
    while attempts > 0:
        try:
            guess = int(input(f"Attempt {len(guesses) + 1}/{attempts + len(guesses)}: Enter your guess: "))
            
            if guess < 1 or guess > max_num:
                print(f"⚠️  Please enter a number between 1 and {max_num}!")
                continue
            
            guesses.append(guess)
            attempts -= 1
            
            if guess == secret_number:
                print(f"\n🎉 CONGRATULATIONS! You guessed it in {len(guesses)} attempts!")
                print(f"The number was: {secret_number}")
                print(f"Your guesses: {guesses}")
                return True
            elif guess < secret_number:
                print(f"📈 Too low! Attempts remaining: {attempts}")
            else:
                print(f"📉 Too high! Attempts remaining: {attempts}")
            
            if attempts > 0:
                print(f"Previous guesses: {guesses}\n")
        
        except ValueError:
            print("❌ Invalid input! Please enter a valid number.")
            continue
    
    # Game over
    print(f"\n💔 GAME OVER! You ran out of attempts.")
    print(f"The secret number was: {secret_number}")
    print(f"Your guesses: {guesses}")
    return False

def main():
    """Main function to handle multiple games"""
    while True:
        play_game()
        
        while True:
            play_again = input("\nDo you want to play again? (yes/no): ").lower().strip()
            if play_again in ['yes', 'no', 'y', 'n']:
                break
            print("Please enter 'yes' or 'no'")
        
        if play_again in ['no', 'n']:
            print("\n👋 Thanks for playing! Goodbye!")
            break
        print("\n" + "=" * 50 + "\n")

if __name__ == "__main__":
    main()

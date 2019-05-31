// Adapted from isEvenOrOdd script
// Runtime is O(n!) so only use in an emergency

use std::io;
use std::cmp::Ordering;

fn main() {
    println!("What is your number?");

    let mut number = String::new();
    io::stdin().read_line(&mut number)
        .expect("Failed to read line");

    let number: i32 = number.trim().parse()
        .expect("Can't interpret that number");

    let (_iseven, half)  = is_even(number);

    println!("Half your number is {}.", half);
}

fn is_even(n: i32) -> (bool, i32) {

    let abs_n: i32 = match n.cmp(&0) {
        Ordering::Less => n - n - n,
        Ordering::Greater => n,
        Ordering::Equal => 0
    };

    let mut counter = 0;
    let mut pile1 = 0;
    let mut pile2 = 0;

    let result: (bool, i32) = loop {
        counter += 1;

        if abs_n == 0 {
            break (true, 0)
        }
        else if abs_n == 1 {
            break (false, 0)
        }

        if is_even(counter - 1).0 {
            pile1 += 1;
        }
        else {
            pile2 += 1;
        }

        if counter == abs_n {
            break (pile1 == pile2, pile2)
        }
    };

    let sign: i32 = if n == 0 {
        1 // Apparently I'm not allowed to divide by 0???
    }
    else {
        abs_n / n
    };

    let result = (result.0, result.1 * sign);
    result
}

Puzzles solved:

1>com.challenge.dropboxdiet

Packing your Dropbox
When you're working with petabytes of data, you have to store files wherever they can fit. All of us here at Dropbox are always searching for more ways to efficiently pack data into smaller and more manageable chunks. The fun begins when you bend the rules a little bit and visualize it in two dimensions.

You'll be given a list of rectangular "files" that you'll need to pack into as small a "Dropbox" as possible. The dimensions of each file will be specified by a tuple (width, height), both of which will be integers. The output of your function should be the area of the smallest rectangular Dropbox that can enclose all of them without any overlap. Files can be rotated 90° if it helps. Bonus points if you can draw pictures of the winning configurations along the way. While drawing pictures, any files sharing dimensions should be considered identical/interchangeable.

Input
Your program must read a small integer N (1 <= N <= 100) from stdin representing the maximum number of files to consider, followed by the width and height of each file, one per line.

Output
Output should be simply be the area of the smallest containing Dropbox. If you want to print pretty pictures, send that to stderr. Only the output on stdout will be judged.

ample Input

3
8 8
4 3
3 4

Sample Output

88


2>com.challenge.packing

The Dropbox Diet
Of the boatload of perks Dropbox offers, the ones most threatening to our engineers' waistlines are the daily lunches, the fully-stocked drink fridge, and a full-length bar covered with every snack you could want. All of those calories add up. Luckily, the office is also well-equipped with ping-pong, a DDR machine, and a subsidized gym right across the street that can burn those calories right back off. Although we often don't, Dropboxers should choose the food they eat to counterbalance the activities they perform so that they don't end up with caloric deficit or excess.

Help us keep our caloric intake in check. You'll be given a list of activities and their caloric impact. Write a program that outputs the names of activities a Dropboxer should choose to partake in so that the sum of their caloric impact is zero. Once the activity is selected, it cannot be chosen again.

Input
Your program reads an integer N (1 <= N <= 50) from stdinrepresenting the number of list items in the test file. The list is comprised of activities or food items and its respective calorie impact separated by a space, one pair per line. Activity names will use only lowercase ASCII letters and the dash (-) character.

Output
Output should be sent to stdout, one activity name per line, alphabetized. If there is no possible solution, the output should be no solution. If there are multiple solutions, your program can output any one of them.

Sample Input 1
_______________
2
red-bull 140
coke 110
Sample Output

no solution

Sample Input 2
_______________
12
free-lunch 802
mixed-nuts 421
orange-juice 143
heavy-ddr-session -302
cheese-snacks 137
cookies 316
mexican-coke 150
dropballers-basketball -611
coding-six-hours -466
riding-scooter -42
rock-band -195
playing-drums -295
coding-six-hours
cookies
mexican-coke













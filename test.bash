#!/bin/sh

echo "2015 AP Computer Science Free Response Solutions";

cd Solutions;

# Question 1
javac DiverseArrayTest.java && java DiverseArrayTest;
echo "Question 1 is correct.";

# Question 2
javac HiddenWordTest.java && java HiddenWordTest;
echo "Question 2 is correct.";

# Question 3
javac SparseArrayTest.java && java SparseArrayTest;
echo "Question 3 is correct.";

# Question 4
javac RangeTest.java && java RangeTest;
echo "Question 4 is correct.";

rm *.class;

cd - > /dev/null;

echo "kewl :)";
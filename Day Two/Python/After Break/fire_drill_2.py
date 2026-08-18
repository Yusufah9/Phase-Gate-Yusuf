
#complete the  function so that it finds the average of the three scores passed to it and returns the letter value #associated with that grade.

def numerical_score(score);
    return score
    score = 80
        if 90 <= score <= 100:
            print('A')
        if 80 <= score < 90:
            print('B')
        if 70 <= score < 80:
            print('C')
        if 60 <= score < 70:
            print('D')
        if 0 <= score < 60:
            print('F') 
average = score / 5
print(average)



def father_son_age(current_father_age, current_son_age):
    return current_father_age, current_son_age

current_father_age = int(input("Enter father's age: "))
current_son_age = int(input("Enter son's age: "))

if current_father_age > current_son_age:
    age_differences = (current_father_age / current_son_age)

father_age_years_ago = current_father_age - current_son_age * 2
  
print(father_age_years_ago)


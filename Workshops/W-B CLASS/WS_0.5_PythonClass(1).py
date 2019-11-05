names1 = ["Steven", "Dennis", "Adrian", "Jerico", "Steven"]

ages1 = [5, 2, 3, 10, 5]


names2 = ["Juan", "Carlos", "Ramiro", "Camila", "Carla"]
ages2 = [1, 3,5,2,4]

names_with_ages = zip(ages1, ages2)

for student in names_with_ages:
    mult = student[0]*student[1]
    print(mult)



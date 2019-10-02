class Student:
    university = "espe"
   # class Meta:
    #    name = 'MetaClass'

    def __init__(self, __id, __name, __age, __career):
        self.id = __id
        self.name = __name
        self.age = __age
        self.career = __career
             class Phone
        class Phone:     
            def __init__(self, _number):
                slf.number

    def __repr__(self):
        return 'Student({}, {}, {}, {})'.format(self.id, self.name, self.age, self.career)
    def say_name(self):
        print('My name is {}'.format(self.name))

student = Student(1, 'Wladymir', 22, 'Ing en sistemas')
student.say_name()
print(student.university)
print(Student.university)
print(Student.id)

print(student)
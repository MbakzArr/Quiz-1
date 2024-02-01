Convert to proper Java:


class Car:
    def __init__(self, year, make, model):
        self.make = make
        self.model = model
        self.year = year

    def drive(self):
        print("vroom")


    def main():
        car = Car(1963, "corvette", "stingray")
        print(str(car.year) + " " + car.make + " " + car.model)
        car.drive()


if __name__ == '__main__':
    main()

class CARRENTAL:
    def __init__(self):
        self.CarId = 0
        self.CarType = ""
        self.Rent = 0.0

    def GetCar(self):
        self.CarId = int(input("Enter Car ID: "))
        self.CarType = input("Enter Car Type (Small Car / Van / SUV): ")

    def GetRent(self):
        if self.CarType.lower() == "small car":
            self.Rent = 1000
        elif self.CarType.lower() == "van":
            self.Rent = 800
        elif self.CarType.lower() == "suv":
            self.Rent = 2500
        else:
            self.Rent = 0
        return self.Rent

    def ShowCar(self):
        print("\nCar Details")
        print("Car ID:", self.CarId)
        print("Car Type:", self.CarType)
        print("Rent:", self.Rent)


# Main Program
c = CARRENTAL()
c.GetCar()
c.GetRent()
c.ShowCar()

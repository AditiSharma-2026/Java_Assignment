class Resort:
    def __init__(self):
        self.RNo = 0
        self.Name = ""
        self.Charges = 0
        self.Days = 0

    # Function to enter details
    def Getinfo(self):
        self.RNo = int(input("Enter Room Number: "))
        self.Name = input("Enter Customer Name: ")
        self.Charges = float(input("Enter Charges per Day: "))
        self.Days = int(input("Enter Number of Days Stayed: "))

    # Function to compute amount
    def Compute(self):
        amount = self.Days * self.Charges
        if amount > 11000:
            amount = amount * 1.02
        return amount

    # Function to display information
    def DispInfo(self):
        amount = self.Compute()
        print("\n--- Resort Details ---")
        print("Room Number:", self.RNo)
        print("Customer Name:", self.Name)
        print("Charges per Day:", self.Charges)
        print("Days Stayed:", self.Days)
        print("Total Amount:", amount)


# Creating object
r = Resort()

# Calling functions
r.Getinfo()
r.DispInfo()

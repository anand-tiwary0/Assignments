import pprint


class sparse:
    def __init__(self, row, col):
        self.row = row
        self.col = col
        self.matrix = {}

    def put(self, row, col, value):
        if col < 0 or col > self.col or row < 0 or row > self.row:
            raise Exception("wrong input")
        else:
            if value != 0:
                self.matrix[(row, col)] = value

    def get_element(self, row, col):
        if col < 0 or col > self.col or row < 0 or row > self.row:
            raise Exception("wrong choice for row and col")
        else:
            element = self.matrix.pop((row, col))

        return element

    def matrixtosparse(self, li):
        for i in range(len(li)):
            for j in range(len(li[i])):
                if li[i][j] != 0:
                    self.matrix[(i, j)] = li[i][j]
        return self.matrix

    def display(self):
        pprint.pprint(self.matrix)


def main():
    arr = [[0, 0, 0, 1, 0], [2, 0, 0, 0, 3], [0, 0, 0, 4, 0]]
    array1 = sparse(row=9, col=9)
    array1.matrixtosparse(arr)
    array1.display()

if __name__ == '__main__':
    main()

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        low = 0
        high = len(numbers)-1
        sum = numbers[low]+numbers[high]
        while(sum!=target and low < high):
            if(sum>target):
                high = high-1
                sum = numbers[low]+numbers[high]
            else :
                low = low+1
                sum = numbers[low]+numbers[high]
        if(sum == target):
            return [low+1,high+1]
        return -1


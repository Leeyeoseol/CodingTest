# 두 정수를 공백으로 구분하여 입력받기
a, b = map(int, input().split())

# 몫과 나머지 계산
mok = a // b
namoji = a % b

# 형식에 맞게 출력 (예: 5...6)
print(f"{mok}...{namoji}")

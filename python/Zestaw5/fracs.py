import fractions

def add_frac(frac1, frac2):
	res = []
	if frac1[1] == frac2[1]:
		res.append(frac1[0] + frac2[0])
		res.append(frac1[1])
	else:
		s = frac1[1] * frac2[1]
		res.append(frac1[0]*frac2[1] + frac2[0]*frac1[1])
		res.append(s)

	return res

def sub_frac(frac1, frac2):
	res = []	
	if frac1[1] == frac2[1]:
		res.append(frac1[0] - frac2[0])
		res.append(frac1[1])
	else:
		s = frac1[1] * frac2[1]
		res.append(frac1[0]*frac2[1] - frac2[0]*frac1[1])
		res.append(s)

	return res

def mul_frac(frac1, frac2):
	res = []
	res.append(frac1[0] * frac2[0])
	res.append(frac1[1] * frac2[1])

	return res

def div_frac(frac1, frac2):
	res = []
	res.append(frac1[0] * frac2[1])
	res.append(frac1[1] * frac2[0])

	return res

def is_positive(frac):
	if frac[0]/frac[1] > 0:
		return True
	else:
		return False

def is_zero(frac):
	if frac[0] == 0:
		return True
	else:
		return False

def cmp_frac(frac1, frac2):
        res1 = frac1[0]*frac2[1]
        res2 = frac2[0]*frac1[1]

	if res1 < res2:
		return -1
	if res1 == res2:
		return 0	
	if res1 > res2:
		return 1
	else:
		print("\n")

def frac2float(frac):
	return float(frac[0]/frac[1])

umur = input("Masukkan umur anda = ")
umur = float(umur)
if (umur>=40):
    print("Anda sudah tua :v")
elif (umur<=40 and umur>=0):
    print("Anda masih muda")
    umurOrtu = input ("Masukkan umur orang tua anda = ")
    if (int(umurOrtu) <= 20):
        print("Anda memerlukan pengasuh")
    else:
        print("Orang tua anda dapat mengasuhnya sendiri")
else:
    print("Anda tidak berumur")
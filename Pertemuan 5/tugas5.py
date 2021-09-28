nama = input ("Masukkan Nama Anda : ")
nim = input ("Masukkan NIM Anda : ")
tahun = input ("Masukkan Tahun Angkatan Anda : ")
lulus = (2021) - int(tahun)
ipk = input ("Masukkan IPK Anda : ")
ipk = float(ipk)
if (ipk>=3.51 and ipk<=4.0 and lulus<=4 ) :
    print("\"Selamat, Anda merupakan Mahasiswa Summa Cumlaud\"")
elif (ipk>=3.51 and ipk<=4.0 ) :
    print("\"Selamat, Anda merupakan Mahasiswa Cumlaud\"")
elif (ipk>=3.01 and ipk<3.51):
    print("\"Selamat, Anda mendapatkan IPK dengan predikat Sangat Memuaskan\"")
elif (ipk>=2.76 and ipk<3.01):
    print("\"Selamat, Anda mendapatkan IPK dengan predikat Memuaskan\"")
elif (ipk>=2.0 and ipk<2.76):
    print("\"Selamat, Anda mendapatkan IPK dengan predikat Cukup\"")
elif (ipk<2.0 and ipk>=0):
    print("\"Mohon Maaf, Anda mendapatkan IPK dengan predikat Tidak Lulus\"")
else:
    print("IPK yang anda masukkan tidak valid")
print("\"Terima Kasih\"")
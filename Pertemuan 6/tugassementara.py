print ("Program Siakad")
print ()
print ("1. Tambah Data")
print ("2. Edit Data")
print ("3. Hapus Data")
print ("4. Lihat Data")
menuC = input ("Menu yang Anda pilih = ")
menuC = int (menuC)
if (menuC == 1):
    print ("1. Tambah Data Mahasiswa")
    print ("2. Tambah Data Mata Kuliah")
    print ("3. Kembali")
    menuC2 = input ("Menu yang Anda pilih = ")
    menuC2 = int (menuC2)
    if (menuC2 == 1):
        nama = input ("Masukkan nama mahasiswa = ")
        print ("Mahasiswa yang Anda tambah adalah " + nama)
    elif (menuC2 == 2):
        matkul = input ("Masukkan mata kuliah = ")
        print ("Mata kuliah yang Anda tambah adalah " + matkul)
    elif (menuC2 == 3):
        print ("Terima Kasih")
    else:
        print ("Menu tidak ada")
elif (int(menuC) >=2 and int(menuC)<=4):
    print ("Fitur belum ada")
else:
    print ("Menu tidak tersedia")
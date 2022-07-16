## Project Belajar Apache Maven
Repositori ini berisikan source code dalam pembuatan project dasar pada java menggunakan Maven sebagai build automation tools. Untuk pembelajaran, di dalam repositori ini terdapat 2 module yakni data dan app dengan distribution dan management dependency pada masing-masing module

### Pembuatan Project
* Download Apache Maven [disini](https://maven.apache.org/download.cgi)
* Atur Environment Variables pada OS, tambahkan MAVEN_HOME di user variables dan folder bin pada path
* Buka CMD, cek versi maven dengan command `mvn --version`
* Akses folder melalui cmd untuk menyimpan file project apache maven
* `mvn archetype:generate` untuk membuat project
* `maven-archetype-quickstart` untuk menambahkan nama dan beberapa spesifikasi project

### Perintah Dasar
* `mvn clean` untuk membersihkan project dari folder target
* `mvn compile` untuk kompilasi dan menghasilkan folder target
* `mvn test` untuk testing code


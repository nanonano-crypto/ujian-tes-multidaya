<?php 
$sumber = "kota.json";
$kontent = file_get_contents($sumber);
$data = json_decode($kontent, true);

$clear_array = array_unique($data);
?>
<html>
    <head>
        <title>
            menghapus data ganda
        </title>
    </head>
    <body>
        <h3>Menampilkan semua data</h3>
        <br>
        <table border="1" style="width: 15%;">
            <tr>
                <th>No</th>
                <th>Nama kota</th>
            </tr>
        <?php 
            for($i=0; $i<count($data); $i++){                 
                echo "<tr>";
                //penomoran otomatis                   
                echo "<td>".$i."</td>";
                //menampilkan data
                echo "<td>".$data[$i]."</td>";     
                echo "</td>";           
            }
        ?>
        </table>
        <br>
        <br>
        <h4>Data dulikat sudah terhapus</h4>
        <br>
        <?php
        error_reporting(0);
        $hapus_duplikat = array_unique($data);
        for($i=0; $i < count($data); $i++){
            echo $hapus_duplikat[$i]." <br>";
            // $hapus_duplikat = array_unique($data);
            // print_r($data); 
        }
       ?>
    </body>
</html>

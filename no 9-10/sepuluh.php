<?php 
$sumber = "identitas.json";
$kontent = file_get_contents($sumber);
$data = json_decode($kontent, true);
?>
<html>
    <head>
        <title>tampil data dari json</title>
    </head>
    <body>
        <center>
        <h1> Menampilkan semua data</h1>
        <br><br>
        <table border="1" style="width: 50%;">
            <tr>
                <th>Nomor</th>
                <th>id</th>
                <th>nama</th>
                <th>age</th>
            </tr>            
            <?php 
                for($a = 0; $a < count($data); $a++){                   
                        echo "<tr>";
                        //penomoran otomatis                   
                        echo "<td>".$a."</td>";
                        //menampilkan data
                        echo "<td>".$data[$a]['id']."</td>";
                        echo "<td>".$data[$a]['name']."</td>";
                        echo "<td>".$data[$a]['age']."</td>";
                        echo "</tr>";                    
                }
            ?>
           
        </table>
        
        <h1> Menampilkan orang yg usianya kurang dari 21 tahun</h1>
        <br>
        <table border="1" style="width: 50%;">
            <tr>
                <th>Nomor</th>
                <th>id</th>
                <th>nama</th>
                <th>age</th>
            </tr>            
            <?php 
                for($a = 0; $a < count($data); $a++){
                    if ($data[$a]['age'] < 21) {
                        echo "<tr>";
                        //penomoran otomatis                   
                        echo "<td>".$a."</td>";
                        //menampilkan data
                        echo "<td>".$data[$a]['id']."</td>";
                        echo "<td>".$data[$a]['name']."</td>";
                        echo "<td>".$data[$a]['age']."</td>";
                        echo "</tr>";
                    }
                }
            ?>           
        </table>
        </center>
    </body>
</html>
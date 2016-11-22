

 function CalculerMontantTTC()
 {
	 var tva = 0.07;
	 mon_form.tarifttc.value = my_form.tarifht.value * (1+tva) ;
	 alert('hellllllllllllooo');
 }
  function CalculerMontantHT()
 {
	 var tva = 0.07;
	 mon_form.tarifht.value = my_form.tarifttc.value / (1+tva) ;
 }


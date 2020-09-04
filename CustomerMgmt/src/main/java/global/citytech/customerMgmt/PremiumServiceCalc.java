package global.citytech.customerMgmt;

public class PremiumServiceCalc {
   public int gym = 2000, jumba = 1500, kickBoxing = 3000;
   public double premiumDis = 0.10;


   public  double gymDiscount() {
      return gym - (gym * premiumDis);
   }

   public double jumbaDiscount() {
      return (jumba - (premiumDis * jumba));


   }
   public double  kickBoxingDiscount() {
      return (kickBoxing-(premiumDis * kickBoxing));


      }
   }



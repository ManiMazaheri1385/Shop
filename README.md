# پروژه فروشگاه 🏬
### درود!
توی این یکی پروژه قراره باب اسفنجی و پاتریک و اختاپوس همبرگر خرچنگی (🍔🦀) بخرن 🥰🥰 هورا!!<br />
دقت کنید حتی خود باب اسفنجی و اختاپوس با اینکه کارمند اونجان ولی باز باید پول بدن 🥲.
## payment package
## **interface:**
### &nbsp; Payment Strategy
- اینجا اومدیم دو تا متد `pay` و `getPaymentDetails` رو تعریف کردیم ولی بدنه‌اشون رو نساختیم تا توی کلاس هایی که ازش **implement** می‌کنن مطمئن بشیم حتما تعریف و استفاده بشه.
## **classes:**
### &nbsp; <img src="https://github.com/user-attachments/assets/264a9d9f-6dde-408a-9508-491e6a884a9c" width="35"> &nbsp; Credit Card Payment
- اینجا فیلد‌های `cardNumber` و `cardHolderName` تعریف شدن که کانستراکتور اون‌ها رو ورودی می‌گیره.
- این کلاس interface عه `PaymentStrategy` رو implement می‌کنه پس مجبوره که اون دو تا متد رو که بدنه‌ای ندارن بدنه‌اش رو بنویسه.
- متد `pay` رو تعریف کردیم و توش از متد `getPaymentDetails` هم استفاده کردیم تا وقتی پرداخت صورت گرفت اطلاعات چاپ بشه.
- متد `getPaymentDetails` میاد اطلات رو return می‌کنه.
---
### &nbsp; <img src="https://github.com/user-attachments/assets/57789d1d-a096-41e7-83eb-086e63f97bf7" width="35"> &nbsp; PayPal Payment
- فیلد `email` تعریف شده و کانستراکتور اون رو ورودی می‌گیره.
- چون این کلاس interface عه `PaymentStrategy` رو implement می‌کنه پس باید اون دو تا متدی که توش تعریف شده رو بدنه‌اش رو بنویسه.
- متد `pay` دقیقا مثل کلاس قبلی تعریف شده.
- متد `getPaymentDetails` هم مشابه کلاس قبلیه اما اطلاعاتی که return می‌کنه فرق داره. 
---
### &nbsp; <img src="https://github.com/user-attachments/assets/a2909eaa-6fe9-4857-8094-e77755f23973" width="35"> &nbsp; Bitcoin Payment
- فیلد `walletAddress` رو نوشتیم و کانستراکتور مقداردهی‌اش می‎کنه.
- بخاطر اینکه این کلاس interface عه `PaymentStrategy` رو implement کرده پس باید دو تا متدی که توش تعریف شده رو بدنه‌اش رو تشکیل بده.
- متد `pay` این بار هم دقیقا مثل کلاس‌های قبلی تعریف شده.
- متد `getPaymentDetails` هم دوباره مشابه کلاس‌‎های قبلیه این دفعه هم اطلاعاتی که return می‌کنه فرق داره.
---
### &nbsp; Customer
#### خوش آمدید به کلاس پدر همه مشتری‌ها این کلاس abstract عه یعنی نمی‌تونیم ازش مستقیم objectای تعریف کنیم (😭😭) اما قراره دو تا کلاس `RegularCustomer` و `PremiumCustomer` که بچه‌هاش هستن ارث پدرشون رو بکشن بالا 🥰🥰 (ارث بری کنن دیگه).
- میام فیلد اسم مشتری `name` و آرایه لبیست تاریخچه پرداخت‌های هر مشتری `paymentHistory` رو می‌نویسیم و توی کانستراکتور این کلاس مقدار دهی می‌شن.
#### بریم سراغ متد‌ها
- متد `displayCustomerInfo` عه abstract هست یعنی باید بچه مچه‎‌های این باباعه حتما خودشون بدنه‌اش رو تعریف کنن.
- متد بعدی ما `makePayment` هست که میاد میک می‌کنه پی‌منت‌ها رو (😁😁) میاد یه `PaymentStrategy` و قیمت ورودی می‌گیره بعد با اون روش مد نظر پرداخت رو انجام می‌ده و بعدش هم به این پرداخت رو به تاریخچه پرداخت‌های این مشتری اضافه می‌کنه.
- متد `showPaymentHistory` رو داریم که ایشون تمام تاریخچه پرداخت‌های مشتری عزیزمون رو چاپ می‌کنه.
---
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;◯ RegularCustomer
#### بچه معمولی‌مون
- ایشون یکی از ارث برها هستن که میان تو کانستراکتورشون super رو صدا می‌کنن و `name` رو از پاپای (اسپانیایی 🙃) گرامی‌شون می‌گیرن.
- سپس دوست عزیز اون متدی که مجبوره تعریف کنه یعنی `displayCustomerInfo` بدنه‌اش رو تعریف می‌کنه و توش با ذکر می‌‌کنه که من بدبخت یه مشتری معمول‎ی‌ام 😭😭😭.
---
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;⭐PremiumCustomer
#### بچه پریمیوم‌مون
- یکی دیگه از ارث خور هامون ولی این دفعه از نوع ریچش ایشون هم توی کانستراکتورشون میان با super میگن بابایی `name` رو بده.
- و با فخر فروشی تمام در متد `displayCustomerInfo` که مجبوره بدنه‌اش رو تشکیل بده اسمش رو می‌گه و به پریمیوم بودنش افتخار می‌کنه.
---
## Main
#### بلاخره!
- سه تا مشتری از Bikini Bottom تعریف می‌کنیم.
- برای هر کدوم از مشتری‌هامون روش پرداخت برای خرید یه همبرگر خرچنگی (🍔🦀) می‌سازیم.
- حالا اطلاعات این مشتری‌ها چاپ می‌شن.
- پرداخت‌ها صورت می‌گیرن (بنظرتون با یه دونه بیت‌کوین چند تا همبرگر خرچنگی (🍔🦀) میدن؟ 😅😅).
- حالا هم تاریخچه پرداخت‌ها چاپ می‌شوند.
- آقای خرچنگ 🦀 پولدارتر می‎‌شه الان در زمان نوشتن این README قیمت هر بیت‌کوین 8.116.654.693 اینقدر تومنه الان هم 1.4 تا بیت‌کوین داره پس خوشبحال‌اش.
## خروجی کد:
```
========================================
Customer Information:
   Customer type: Regular
   Customer name: SpongeBob

Customer Information:
   Customer type: Regular
   Customer name: Patrick

Customer Information:
   Customer type: Premium
   Customer name: Squidward
========================================

****************************************
Credit card payment details:
   Card holder name: SpongeBob
   Card number: 6037
   Amount paid: $125.37

Credit card payment details:
   Card holder name: SpongeBob
   Card number: 6037
   Amount paid: $36.21
****************************************
PayPal payment details:
   Email: Patrick@gmail.com
   Amount paid: $14.25

PayPal payment details:
   Email: Patrick@gmail.com
   Amount paid: $5.0
****************************************
Bitcoin payment details:
   Wallet address: Bikini Bottom Blue Moai Statue
   Amount paid: ₿1.0

Bitcoin payment details:
   Wallet address: Bikini Bottom Blue Moai Statue
   Amount paid: ₿0.4
****************************************

----------------------------------------
SpongeBob payment history:

Credit card payment details:
   Card holder name: SpongeBob
   Card number: 6037
   Amount paid: $125.37
Credit card payment details:
   Card holder name: SpongeBob
   Card number: 6037
   Amount paid: $36.21
----------------------------------------
Patrick payment history:

PayPal payment details:
   Email: Patrick@gmail.com
   Amount paid: $14.25
PayPal payment details:
   Email: Patrick@gmail.com
   Amount paid: $5.0
----------------------------------------
Squidward payment history:

Bitcoin payment details:
   Wallet address: Bikini Bottom Blue Moai Statue
   Amount paid: ₿1.0
Bitcoin payment details:
   Wallet address: Bikini Bottom Blue Moai Statue
   Amount paid: ₿0.4
----------------------------------------
```
### بدرود!

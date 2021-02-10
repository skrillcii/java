from py4j.java_gateway import JavaGateway, GatewayParameters
import ipdb
ipdb.set_trace()

gateway = JavaGateway(gateway_parameters=GatewayParameters(port=25333))
random = gateway.jvm.java.util.Random()
number1 = random.nextInt(10)
number2 = random.nextInt(10)
print(number1, number2)

addition_app = gateway.entry_point
value = addition_app.addition(number1, number2)
print(value)

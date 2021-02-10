from py4j.java_gateway import JavaGateway, GatewayParameters

gateway = JavaGateway(gateway_parameters=GatewayParameters(port=25333))
stack = gateway.entry_point.getStack()

# Basic push & pop
stack.push('First item')
stack.push('Second item')
print(stack.pop())
print(stack.pop())
print(stack.pop())

# Basic list operations - push, pop, append
jvm_list = stack.getInternalList()
print(len(jvm_list), jvm_list)
stack.push('First item')
print(len(jvm_list), jvm_list)
jvm_list.append('Second item')
print(len(jvm_list), jvm_list)
jvm_list.append('Third item')
print(len(jvm_list), jvm_list)

# Basic list operations - slice, pushAll
slice_list = jvm_list[0:2]
print(len(slice_list), slice_list)
stack.pushAll(slice_list)
print(len(jvm_list), jvm_list)

# Inspect available members
print(gateway.help(stack))

<template>
  <div class id>
    <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
    >
      <el-form-item label="图书名称" prop="name">
        <el-input v-model="ruleForm.name"></el-input>
      </el-form-item>

      <el-form-item label="作者" prop="author">
        <el-input v-model="ruleForm.author"></el-input>
      </el-form-item>

      <el-form-item label="出版社" prop="publish">
        <el-input v-model="ruleForm.publish"></el-input>
      </el-form-item>

      <el-form-item label="价格" prop="price">
        <el-input v-model="ruleForm.price"></el-input>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">立即创建</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "",
  data() {
    return {
      ruleForm: {
        name: "",
        author: "",
        publish: "",
        price: ""
      },
      rules: {
        // 校验规则
        name: [
          { required: true, message: "请输入图书名称", trigger: "blur" },
          { min: 3, max: 35, message: "长度在 3 到 35 个字符", trigger: "blur" }
        ],
        author: [
          { required: true, message: "请输入作者名称", trigger: "blur" },
          { min: 3, max: 35, message: "长度在 3 到 35 个字符", trigger: "blur" }
        ],
        publish: [
          { required: true, message: "请输入出版社名称", trigger: "blur" },
          { min: 3, max: 35, message: "长度在 3 到 35 个字符", trigger: "blur" }
        ],
        price: [
          { required: true, message: "请输入价格", trigger: "blur" },
          { min: 3, max: 35, message: "长度在 3 到 35 个字符", trigger: "blur" }
        ]
      }
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate(valid => {
        if (valid) {
          axios
            .post("http://127.0.0.1:8081/book/save", this.ruleForm)
            .then(res => {
              this.$message({
                message: "添加书籍成功",
                type: "success",
                center: true
              });
              //  添加成功后，实现了路由的跳转
              // if(res.data == 'success'){
              //   this.$router.push('/bookList')
              // }
            });
        } else {
          console.log("error submit!!");
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
};
</script>

<style scoped>
</style>
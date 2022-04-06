<template>
    <div>
        <v-container>
            <h3>Vue 파일 업로드 </h3>
            <div>
                <label>Files
                    <input type="file" id="files" ref="files" 
                            multiple v-on:change="handleFileUpload()"/>
                </label>
                <button v-on:click="submitFiles()">파일 업로드</button>
            </div>
            <div>
                <label>Files
                    <input type="file" id="files2" ref="files2"
                           multiple v-on:change="handleFileUpload2()"/>
                </label>
                <button v-on:click="submitFiles2()">파일 + 문자열 전송</button>
            </div>
        </v-container>
    </div>
</template>

<script>

import axios from 'axios'

export default {
    name: 'VueFileUploadPage',
    data () {
        return {
            files: '',
            files2: '',
            response: ''
        }
    },
    methods: {
        handleFileUpload () {
            this.files = this.$refs.files.files
        },
        handleFileUpload2 () {
          this.files2 = this.$refs.files2.files
        },
        submitFiles () {
            let formData = new FormData()

            for (let idx = 0; idx < this.files.length; idx++) {
                formData.append('fileList', this.files[idx])
            }

            axios.post('http://localhost:7777/57th/file/uploadImg', formData, {
                headers: {
                    'Content-Type': 'multipart/form-data'
                }
            })
            .then (res => {
                alert('처리 결과: ' + res.data)
            })
            .catch (res => {
                alert('처리 결과: ' + res.message)
            })
        },
        submitFiles2 () {
            let formData = new FormData()

          let fileinfo = {
            price: 50000,
            test: "test"
          }

          for (let idx = 0; idx < this.files2.length; idx++) {
            formData.append('fileList', this.files2[idx])
          }

          formData.append(
              "info",
              new Blob([JSON.stringify(fileinfo)], { type: "application/json" })
          );

            axios.post('http://localhost:7777/57th/file/uploadImgWithString', formData)
            .then (res => {
                alert('처리 결과: ' + res.data)
            })
            .catch (res => {
                alert('처리 결과: ' + res.message)
            })
        }
    }
}

</script>
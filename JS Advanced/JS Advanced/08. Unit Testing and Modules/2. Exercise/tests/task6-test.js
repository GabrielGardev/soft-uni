let PaymentPackage = require('../task6');
let assert = require('chai').assert;

describe("PaymentPackage behavior", function () {
    describe("constructor check", () => {
        it("valid parameters", function () {
            let pp = new PaymentPackage('HR Services', 1500);
            assert.deepEqual(pp, {
                _name: 'HR Services',
                _value: 1500,
                _VAT: 20,
                _active: true
            });
        });
    });
    describe("toString check", () => {
        it("toString should return correct with 0", () => {
            let pp = new PaymentPackage('HR Services', 0);
            assert.equal(pp.toString(), "Package: HR Services\n- Value (excl. VAT): 0\n- Value (VAT 20%): 0")
        });

        it("toString should return correct inactive", () => {
            let pp = new PaymentPackage('HR Services', 1500);
            pp.active = false;
            assert.equal(pp.toString(), "Package: HR Services (inactive)\n- Value (excl. VAT): 1500\n- Value (VAT 20%): 1800")
        });
    });
});
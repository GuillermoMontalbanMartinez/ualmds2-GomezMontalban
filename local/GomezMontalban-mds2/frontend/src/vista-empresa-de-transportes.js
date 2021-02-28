import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `empresa-de-transportes`
 *
 * EmpresaDeTransportes element.
 *
 * @customElement
 * @polymer
 */
class EmpresaDeTransportes extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'empresa-de-transportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(EmpresaDeTransportes.is, EmpresaDeTransportes);
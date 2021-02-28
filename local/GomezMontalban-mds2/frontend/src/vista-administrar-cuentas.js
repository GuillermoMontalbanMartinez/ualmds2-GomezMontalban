import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrar-cuentas`
 *
 * VistaAdministrarCuentas element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarCuentas extends PolymerElement {

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
        return 'vista-administrar-cuentas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarCuentas.is, VistaAdministrarCuentas);

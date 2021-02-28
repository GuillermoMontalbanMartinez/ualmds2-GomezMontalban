import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-dar-baja-cuenta`
 *
 * VistaDarBajaCuenta element.
 *
 * @customElement
 * @polymer
 */
class VistaDarBajaCuenta extends PolymerElement {

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
        return 'vista-dar-baja-cuenta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarBajaCuenta.is, VistaDarBajaCuenta);
